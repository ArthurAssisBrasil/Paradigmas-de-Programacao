import Data.Char

main :: IO ()
main = do
    strcontent <- readFile "nomes.csv"
    let strlist = lines strcontent
    	strnew = zipWith (++) strlist (map (","++) (map (userName) strlist))
    writeFile "logins.csv" (unlines strnew)

userName :: String -> String
userName [] = []
userName str = (map (toLower) . ([head (str)] ++) . reverse . takeWhile (/= ' ') . reverse) str
