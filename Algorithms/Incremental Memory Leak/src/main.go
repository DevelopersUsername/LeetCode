package main

import "fmt"

func main() {
	fmt.Println(memLeak(2, 2))
}

func memLeak(memory1 int, memory2 int) []int {

	ans := 1
	for memory1 >= ans || memory2 >= ans {

		if memory1 >= memory2 {
			memory1 -= ans
		} else {
			memory2 -= ans
		}
		ans++
	}

	return []int{ans, memory1, memory2}
}
