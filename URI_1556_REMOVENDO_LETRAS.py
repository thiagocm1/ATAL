def remove(word1, word2):
	listOfWords.append(word1)
	auxList = []
	for i in xrange(len(word2)):
		if(word2[i] not in auxList):
			auxList.append(word2[i])
			remove(word1 + word2[i],word2[i+1:])

while True:
	try:
		listOfWords = []
		word = raw_input()
		remove(word[0],word[1:])
		
		for i in xrange(len(listOfWords)):
			if(len(listOfWords[i]) > 1):
				listOfWords.append(listOfWords[i][1:])
		
		listOfWords = list(set(listOfWords))
		listOfWords.sort()
		
		for j in xrange(len(listOfWords)):
			print listOfWords[j]
		print
	except EOFError:
		break
