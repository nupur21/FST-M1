user1 = input("Player1's name: ")
user2 = input("Player2's name: ")

user1_ans = input(user1 +" do you want rock, paper or scissors?").lower()
user2_ans = input(user2 +" do you want rock, paper or scissors?").lower()

if(user1_ans == user2_ans):
    print("It's a tie")
elif(user1_ans == 'rock'):
    if(user2_ans == 'scissors'):
        print("Player1 wins")
    else:
        print("Player2 wins")
elif(user1_ans == 'scissors'):
    if(user2_ans == 'paper'):
        print("Player1 wins")
    else:
        print("Player2 wins")
elif(user1_ans == 'paper'):
    if(user2_ans == 'rock'):
        print("Player1 wins")
    else:
        print("Player2 wins")
else:
    print("You have entered wrong input. Please enter rock, paper or scissors")