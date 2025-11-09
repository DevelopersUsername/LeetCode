package main

import (
	"fmt"
	"math"
)

func main() {
	fmt.Println(minimumDistance([]int{1, 2, 1, 1, 3}))
	fmt.Println(minimumDistance([]int{1, 1, 2, 3, 2, 1, 2}))
}

func minimumDistance(nums []int) int {

	if len(nums) < 3 {
		return -1
	}

	ans := math.MaxInt
	count := getNumsCount(nums)

	for i := 0; i < len(nums); i++ {

		if count[nums[i]] < 3 {
			continue
		}

		dist := [2]int{-1, -1}
		for j := i + 1; i < len(nums) && dist[1] == -1; j++ {

			if nums[i] == nums[j] {
				if dist[0] == -1 {
					dist[0] = j
				} else {
					dist[1] = j
				}
			}
		}

		distance := (dist[0] - i) + (dist[1] - dist[0]) + dist[1] - i
		ans = min(ans, distance)
		count[nums[i]]--
	}

	if ans == math.MaxInt {
		return -1
	} else {
		return ans
	}
}

func getNumsCount(nums []int) []int {

	count := make([]int, len(nums)+1)
	for _, num := range nums {
		count[num]++
	}

	return count
}
