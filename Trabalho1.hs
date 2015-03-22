-- 1.Escreva uma função hasEqHeads :: [Int] -> [Int] -> Bool que verifica se as 2 listas possuem o mesmo primeiro elemento. 
hasEqHeads :: [Int] -> [Int] -> Bool
hasEqHeads lis1 lis2 = if head lis1 == head lis2 then True else False



-- 2.Observe a função abaixo, que eleva ao cubo cada elemento da lista, produzindo outra lista.
pot3 :: [Int] -> [Int]
pot3 [] = []
pot3 ns = (head ns)^3 : pot3 (tail ns)


-- 3.Escreva uma função recursiva add10, que adicione a constante 10 a cada elemento de uma lista, produzindo outra lista.
add10 :: [Int] -> [Int]
add10 [] = []
add10 lis = (head lis) + 10 : add10 (tail lis)



-- 4.Escreva uma função recursiva addComma, que adicione uma vírgula no final de cada string contida numa lista. 
addComma :: [String] -> [String]
addComma [] = [","]
addComma lis = ((head lis) ++ ",") : addComma (tail lis)



-- 5.Refaça os 2 exercícios anteriores usando a função de alta ordem 'map'.
add10Map :: [Int] -> [Int]
add10Map [] = []
add10Map lis = map (+ 10) lis

addCommaMap :: [String] -> [String]
addCommaMap [] = [","]
addCommaMap lis = map (++ ",") lis



-- 6.Crie uma função htmlListItems :: [String] -> [String], que receba uma lista de strings e retorne outra lista contendo as strings formatadas como itens de lista em HTML.
auxHtmlListItems :: String -> String
auxHtmlListItems [] = []
auxHtmlListItems str = "<LI>" ++ str ++ "</LI>"

htmlListItems :: [String] -> [String]
htmlListItems lis = map (auxHtmlListItems) lis



-- 7.Crie uma função recursiva charFound :: Char -> String -> Bool, que verifique se o caracter (primeiro argumento) está contido na string (segundo argumento).
charFound :: Char -> String -> Bool
charFound c s
	| s == [] = False
	| c == (head s) = True
	| otherwise = charFound c (tail s)



-- 8.Reescreva a função anterior sem recursão, usando outras funções pré-definidas já vistas em aula.
achaChar :: Char -> String -> Bool
achaChar c s 
	| (filter (== c) s) == [] = False
	| otherwise = True



-- 9.Use a função de alta ordem 'zipWith' para produzir uma função que obtenha as diferenças, par a par, dos elementos de duas listas. Por exemplo: para listas de entrada [1,2,3,4] e [2,2,1,1], o resultado será [-1,0,2,3].
diferencas :: [Int] -> [Int] -> [Int]
diferencas x y = zipWith (-) x y



-- Funções de alta ordem

-- 1.Dada uma lista de números, calcular 2*n+1 para cada número n contido na lista.
calculoLista :: [Int] -> [Int]
calculoLista lis = map (+ 1) (map (* 2) lis)



-- 2.Dadas duas listas X e Y de numeros inteiros, calcular 4*x+2*y+1 para cada par de numeros x e y pertencentes as listas.
calculoListasXY :: [Int] -> [Int] -> [Int]
calculoListasXY x y = map (+ 1) (zipWith (+) (map (* 4) x) (map (* 2) y)) 



-- 3.Dada uma lista de strings, produzir outra lista com strings de 10 caracteres, usando o seguinte esquema: strings de entrada com mais de 10 caracteres são truncadas, strings com até 10 caracteres são completadas com '.' até ficarem com 10 caracteres.
transforma10Char :: String -> String
transforma10Char str
	| (length str) == 10 = str
	| (length str) > 10 = transforma10Char (init str)
	| (length str) < 10 = transforma10Char (str ++ ".")


str10Caracteres :: [String] -> [String]
str10Caracteres lis = map (transforma10Char) lis 



-- 4.Dada uma lista de idades, selecionar as que são maiores que 20 e, para cada uma, calcular o ano de nascimento correspondente (aproximado, considerando o ano atual).
calculaIdadeMaior20 :: [Int] -> [Int]
calculaIdadeMaior20 lis = map (2015 -) (filter (> 20) lis)
