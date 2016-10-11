name = input();
print('hello,word',200+300,name);
print('''111
	222
	333''');
print('''111
222
33''');
print('''111...222...333''');
print(10/3);

print(b'ABC');

print(b'ABC'.decode('ascii'));
print('---------------');

bir = input('birth: ');
if int(bir)>2000:
	print('00后');
else:
	print('00前');

sum = 0;
ran = list(range(101));
for x in ran:
	sum = sum+x;
print(sum);