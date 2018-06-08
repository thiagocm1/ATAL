#coding: utf-8


def stringMatch(text, pattern):
	
	for i in range(len(text)):
		print(pattern[i])
		
		j = 0
		print(text[i+j])
		
		while((j < len(pattern)) and (pattern[j] == text[i+j])):
			num = pattern[j]
			num2 = text[i+j]
			j += 1
			if(j == len(pattern)):
				print ("match")
				return
	print ("fail")

	

text = "kvjlixapejrbxeenpbzphkhthbkwyrwamnugzhppfxiyjyanhapfwbzubghxmshrlyujfjhrsovk vveylnbxnawavggfdfggrzizyvmfohigeabgkszfnbkmffbzbzxjffqbualeytqrphyrbjqdjqavctg xjifqgfgydhoiwhrvwqbxgrixydzbpzjnhopvlazbzumzhhfavoctdfytvvggikngkwzixgj tlxkojlefilbrboignbzsudssvqynbzuapbpqvlubdoyxkkwhcoudvtkmikbzbzansgsutdjythzlbzbzbzu"
pattern = "bzbzbzu"
stringMatch(text,pattern)
