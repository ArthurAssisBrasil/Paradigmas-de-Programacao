import Data.Char
-- 1.Escreva uma função recursiva firstName :: String -> String que, dado o nome completo de uma pessoa, obtenha seu primeiro nome.
-- Suponha que cada parte do nome seja separada por um espaço e que não existam espaços no início ou fim do nome.
firstName :: String -> String
firstName str
	|filter (== ' ') str == [] = str
	|otherwise = firstName (init str)


-- 2.Escreva uma função firstName' :: String -> String com o mesmo resultado do exercício anterior, mas sem usar recursão. 
firstName' :: String -> String
firstName' str = takeWhile (/= ' ') str


-- 3.Escreva uma função lastName :: String -> String que, dado o nome completo de uma pessoa, obtenha seu último sobrenome. 
-- Suponha que cada parte do nome seja separada por um espaço e que não existam espaços no início ou fim do nome.
lastName :: String -> String
lastName str
	|filter (== ' ') str == [] = str
	|otherwise = lastName (tail str)


-- 4.Escreva uma função não-recursiva userName :: String -> String que, dado o nome completo de uma pessoa, crie um nome de usuário (login) da pessoa, 
-- formado por: primeira letra do nome seguida do sobrenome, tudo em minúsculas.
userName :: String -> String
userName [] = []
userName str = map (toLower) ([head (str)] ++ (reverse (takeWhile (/= ' ') (reverse (str)))))


-- 5.Escreva uma função não-recursiva encodeName :: String -> String que substitua vogais em uma string, conforme
-- o esquema a seguir: a = 4, e = 3, i = 1, o = 0, u = 00.
encodeName :: String -> String
encodeName str = concatMap (encodeAux) str


encodeAux :: Char -> String
encodeAux a
	|a == 'a' || a == 'A' = "4"
	|a == 'e' || a == 'E' = "3"
	|a == 'i' || a == 'I' = "1"
	|a == 'o' || a == 'O' = "0"
	|a == 'u' || a == 'U' = "00"
	|otherwise = [a]	 



-- 6.Escreva uma função isElem :: Int -> [Int] -> Bool que verifique se um dado elemento pertence a uma lista.
isElem :: Int -> [Int] -> Bool
isElem x lis
	|filter (== x) lis == [] = False
	|otherwise = True


-- 7.Escreva uma função recursiva que retorne o número de vogais em uma string.
retornaNumVog :: String -> Int
retornaNumVog str
	|str == [] = 0
	|vogal (head (str)) == True = retornaNumVog (tail str) + 1
	|otherwise = retornaNumVog (tail str)

vogal :: Char -> Bool
vogal a
	|a == 'a' || a == 'A' || a == 'e' || a == 'E' = True
	|a == 'i' || a == 'I' || a == 'o' || a == 'O' || a == 'u' || a == 'U' = True
	|otherwise = False



-- 8.Escreva uma função não-recursiva que retorne o número de consoantes em uma string.
numCons :: String -> Int
numCons str = sum (map (consoante) str)
	
consoante :: Char -> Int
consoante a
	|a == 'a' || a == 'A' || a == 'e' || a == 'E' = 0
	|a == 'i' || a == 'I' || a == 'o' || a == 'O' || a == 'u' || a == 'U' = 0
	|(a < 'A') || (a > 'Z' && a < 'a') || (a > 'z') = 0
	|otherwise = 1


-- 9.Escreva uma função não-recursiva isInt :: String -> Bool que verifique se uma dada string só contém dígitos (0 a 9).
isInt :: String -> Bool
isInt str
	|str == [] = False
	|filter (digito) str == str = True
	|otherwise =  False

digito :: Char -> Bool
digito a
	|(a >= '0' && a <= '9') = True
	|otherwise = False


-- 10.Escreva uma função não-recursiva strToInt :: String -> Int que converta uma string em um número inteiro, fazendo operações 
-- aritméticas com seus dígitos (p.ex.: "356" = 3*100 + 5*10 + 6*1 = 356). Considere que a string seja um número válido, isto é, só 
-- contenha dígitos de 0 a 9.
strToInt :: String -> Int
strToInt str = sum (zipWith (*) (map (10 ^) [(length str) -1, (length str) -2 .. 0]) (map (digitToInt) str))
