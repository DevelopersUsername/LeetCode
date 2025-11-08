package main

func main() {
	println(minMoves([]int{2, 1, 3}))
	println(minMoves([]int{4, 4, 5}))
}

func minMoves(nums []int) int {

	maxNum := 0
	count := 0
	sum := 0

	for i := range nums {
		maxNum = max(maxNum, nums[i])
	}

	for i := range nums {
		if nums[i] != maxNum {
			count++
			sum += nums[i]
		}
	}

	return count*maxNum - sum
}
