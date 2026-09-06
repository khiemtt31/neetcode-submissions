func topKFrequent(nums []int, k int) []int {
	resMap := make(map[int]int)

	for _, num := range nums {
		resMap[num]++
	}

	var res []int

	for k > 0 {
		maxVal := 0
		maxKey := 0

		for key, val := range resMap {
			if val > maxVal {
				maxVal = val
				maxKey = key
			}
		}

		res = append(res, maxKey)
		delete(resMap, maxKey)

		k--
	}

	return res
}