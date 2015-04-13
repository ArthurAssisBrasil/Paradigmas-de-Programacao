import Data.Char
-- 1.As funções de alta ordem any e all são pré-definidas na biblioteca Prelude do Haskell (veja seção Special Folds).
-- Estude e teste essas funções e apresente 2 exemplos de uso de cada uma delas.
-- any:
isElem :: Int -> [Int] -> Bool
isElem x lis
	|any (== x) lis = True
	|otherwise = False

firstName :: String -> String
firstName str
	|any (==' ') str = firstName (init str)
	|otherwise = str


-- all:
isElem' :: Int -> [Int] -> Bool
isElem' x lis
	|all (/= x) lis = False
	|otherwise = True

firstName' :: String -> String
firstName' str
	|all (/=' ') str = str
	|otherwise = firstName (init str)


-- 2.Em Haskell, o símbolo '$' pode ser usado para escrever códigos ainda mais curtos.
-- Descubra seu significado e apresente 2 exemplos de uso.

strToInt :: String -> Int
strToInt str = sum $ zipWith (*) (map (10 ^) [(length str) -1, (length str) -2 .. 0]) (map digitToInt str)


numCons :: String -> Int
numCons str = sum $ map (consoante) str
	
consoante :: Char -> Int
consoante a
	|a == 'a' || a == 'A' || a == 'e' || a == 'E' = 0
	|a == 'i' || a == 'I' || a == 'o' || a == 'O' || a == 'u' || a == 'U' = 0
	|(a < 'A') || (a > 'Z' && a < 'a') || (a > 'z') = 0
	|otherwise = 1


-- 3.Haskell permite composição de funções, exatamente como em matemática. 
-- Descubra como fazer isso e apresente 2 exemplos de aplicação de funções compostas.

userName :: String -> String
userName [] = []
userName str = (map (toLower) . ([head (str)] ++) . reverse . takeWhile (/= ' ') . reverse) str

numCons' :: String -> Int
numCons' str = (sum . map (consoante)) str
	
