# #Dictionary value can be any dataType
# #Dictionary keys must be unique
# from operator import le


user ={'name':'Nasr', 'age':23}
print(user)
# # cant print a dictiononary with a list within it as a key
# # user2={'name':'Nasr', 'age':23, [12,13,14]:'items'}
# # print(user2)
# # # can print a dictiononary with a tuple within it as a key
# user3={'name':'Nasr', 'age':23, (12,13,14):'items'}
# print(user3)
# # nested Dictionary
# l= { "one":{'name':'Nasr', 'age':23},"tow":{'name':'Omar', 'age':13}}

# print(l["one"])
# print(len(l))

# user.update({"country":"egy","town":"Porta"})
# print(user)


# copy a dictionary
s6= user.copy()
print(s6)


#dictionary =  A changeable, unordered collection of unique key:value pairs
#                      Fast because they use hashing, allow us to access a value quickly

capitals = {'USA':'Washington DC',
            'India':'New Dehli',
            'China':'Beijing',
            'Russia':'Moscow'}

capitals.update({'Germany':'Berlin'})
capitals.update({'USA':'Las Vegas'})
capitals.pop('China')
# capitals.clear()

print(capitals['Germany'])
print(capitals.get('Germany'))
print(capitals.keys())
print(capitals.values())
print(capitals.items())

for key,value in capitals.items():
    print(key, value)

# create A dictionary from a lists

names=["Nasr","Omar","Mona","Malak","Shahd"]
country= ["egypt"]
newdict=dict.fromkeys(names, country)
print(newdict)
print(newdict.keys())
print(newdict.values())
