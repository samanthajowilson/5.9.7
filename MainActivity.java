var myNumber = 6;
var guess;
onEvent("pickNumber", "change", function() {
  guess = (getText("pickNumber"));
  if (guess == myNumber) {
    setText("userMessage", "You win!");
  } else if ((guess > (myNumber +2))) {
    setText("userMessage", "Guess Lower");
  } else if ((guess < myNumber)) {
    setText("userMessage", "Guess Higher but close!");
  } else if ((guess > myNumber)) {
    setText("userMessage", "Guess Lower but close!");
  } else if ((guess < (myNumber - 2))) {
    setText("userMessage", "Guess Higher");
  }
});
