package main

import (
	"fmt"
	"math"
)

func main() {
	fmt.Println(maximizeExpressionOfThree([]int{1, 4, 2, 5}))
	fmt.Println(maximizeExpressionOfThree([]int{-2, 0, 5, -2, 4}))
}

func maximizeExpressionOfThree(nums []int) int {

	max1 := math.MinInt
	max2 := math.MinInt
	min1 := math.MaxInt

	for _, num := range nums {

		min1 = min(min1, num)

		if num > max1 {
			max2 = max1
			max1 = num
		} else if num > max2 {
			max2 = num
		}
	}

	return max1 + max2 - min1
}
