func hasDuplicate(nums []int) bool {
    duplicateMap := make(map[int]bool)

	for _, num := range nums {
		if duplicateMap[num] == true {
			return true
		}

		duplicateMap[num] = true
	}
	
	return false
}
