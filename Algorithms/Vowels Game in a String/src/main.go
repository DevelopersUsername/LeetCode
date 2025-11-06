package main

import "fmt"

func main() {
	fmt.Println(doesAliceWin("leetcoder"))
	fmt.Println(doesAliceWin("bbcd"))
}

func doesAliceWin(s string) bool {

	for i := range len(s) {
		if s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u' {
			return true
		}
	}

	return false
}
