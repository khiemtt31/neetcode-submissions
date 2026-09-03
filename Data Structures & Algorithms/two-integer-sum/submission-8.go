func twoSum(nums []int, target int) []int {
    mapCheck := make(map[int]int)

	for i, num := range nums {
		mapCheck[target - num] = i
	}

	for i, num := range nums {
		if val, exists := mapCheck[num]; exists && i != val {
			return []int{i, val}
		}
	}

	return []int{0, 0}
}
