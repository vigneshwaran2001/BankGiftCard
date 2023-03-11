# BankGiftCard
                                                            Bank Gift Card Application
The bank has initially three customers.There were around eight modules .
1. Account Login (AI)
2. Purchase (UI)
Account Login
Giving customer id and password .Password should be encrypted and stored
Encryption is like
1. A-> B, B->C
2. a-> b, b->c, c->d
3. 0->1, 1->2
On successful login, it should print the account details
1.Create Gift Card
2.TopUp
3.Transaction History
4.Block
5.Logout
1.Create Gift Card
Gift card with 5 digit card no and 4 digit pin number will be generated
2.TopUp
For topup, amount need to be reduced from main account balance and added to gift card
3.Transaction History
Should print all the transaction details of a particular gift card
4.Block
If the card is blocked, shouldn’t be available for topUp, Purchase.the amount in gift card should be
transferred to main account
5.Logging Out
After log out, should go to main module,
6.Purchase (UI)
-->Login to the gift card
-->Purchase Amount
-->Then print Available balance
7.Redeem points :
For Every 100 rupee purchase, 1 reward point is added .For 10 reward points, 10rs will be added to
main account
8.Doing for Multiple gift cards
