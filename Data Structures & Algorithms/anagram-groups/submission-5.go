func groupAnagrams(strs []string) [][]string {
	var res [][]string

	resMap := make(map[[26]int][]string)

	for _, str := range strs {
		var freq [26]int

		for _, c := range str {
			freq[c-'a']++
		}

		resMap[freq] = append(resMap[freq], str)
	}

	for _, val := range resMap {
		res = append(res, val)
	}

	return res
}
