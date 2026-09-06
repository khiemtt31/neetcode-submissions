func topKFrequent(nums []int, k int) []int {
	var res []int
	resMap := make(map[int]int)

	for _, num := range nums {
		resMap[num]++ // 7 1
	}

	for k > 0 {
		maxVal := 0
		maxKey := 0		

		for key, val := range resMap {
			if val > maxVal {
				maxVal = val
				maxKey = key
			}
		}

		k--
		res = append(res, maxKey)
		delete(resMap, maxKey)
	}

	return res
}
