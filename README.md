A Voice command application using Java and Sphinx4 Speech Recognition Library for Java.

If you are new to this Voice Command term, there are many apps that serve as an example in reality. If you are an Android user, you must have used the Google App where you speak “Ok Google” and it listens to your command and if you say something like “open google”, it’ll automatically launch Chrome and open Google.com on it.


Now when you speak into your mic, the computer might not be able to understand what is it that you are saying so we’ll be providing our computer with the ability to recognize the words that we say and then covert them into a form that the computer is able to understand hence basis of the term Speech Recognition. You might be wondering how in the world are we going to do that? Well we don’t have to worry about anything because we have  been blessed with a library called Sphinx4 which does all the complex work for us hence we only have to call certain methods in order to create our Voice Command app.

Approach
So what is it that our app is going to do?

1.We will speak a command like “open terminal” in our mic
2.Sphinx4 detects and recognizes the words that we speak
3.Sphinx4 outputs the recognized words
4.We compare the words to our list of commands
5.If a command exists, it’ll execute a certain task
6.Wait for another command and repeat step 2
