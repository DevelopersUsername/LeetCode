package main

import "fmt"

func main() {
	fmt.Println(maxBottlesDrunk(13, 6))
	fmt.Println(maxBottlesDrunk(10, 3))
	fmt.Println(maxBottlesDrunk(6, 3))
}
func maxBottlesDrunk(numBottles int, numExchange int) int {

	ans := numBottles
	for numBottles >= numExchange {
		numBottles = numBottles - numExchange + 1
		numExchange += 1
		ans += 1
	}

	return ans
}
