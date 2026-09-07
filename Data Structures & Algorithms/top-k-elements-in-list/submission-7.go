func topKFrequent(nums []int, k int) []int {
	freq := make(map[int]int)

	for _, val := range nums {
		freq[val]++
	} 

	bucket := make(map[int][]int, len(nums) + 1)

	for num, count := range freq {
		bucket[count] = append(bucket[count], num) 
	}

	res := make([]int, 0, k)
	for count := len(nums); count >= 1; count-- {
		for _, val := range bucket[count] {
			res = append(res, val)
			if (len(res) == k) {
				return res
			}
		}
	}

	return res
}
