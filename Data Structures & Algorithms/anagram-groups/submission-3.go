func groupAnagrams(strs []string) [][]string {
	var tempAnagrams []string
	resMap := make(map[string][]string)
	var res [][]string

	for _, str := range strs {
		chars := strings.Split(str, "")
		sort.Strings(chars)
		x := strings.Join(chars, "")

		tempAnagrams = append(tempAnagrams, x)

		if _, exists := resMap[x]; exists {
			resMap[x] = append(resMap[x], str);
		} else {
			resMap[x] = []string{str}
		}
	}

	for _, val := range resMap {
		res = append(res, val)
	}

	return res;
}
