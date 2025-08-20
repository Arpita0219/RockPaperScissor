function play(userChoice) {
  const choices = ["Rock", "Paper", "Scissors"];
  const computerChoice = Math.floor(Math.random() * 3);

  let resultText = `You chose: ${choices[userChoice]} <br>
                    Computer chose: ${choices[computerChoice]} <br>`;

  if (userChoice === computerChoice) {
    resultText += "<strong>It's a Draw!</strong>";
  } else if (
    (userChoice === 0 && computerChoice === 2) ||
    (userChoice === 1 && computerChoice === 0) ||
    (userChoice === 2 && computerChoice === 1)
  ) {
    resultText += "<strong style='color:green'>🎉 You Won!</strong>";
  } else {
    resultText += "<strong style='color:red'>💻 Computer Won!</strong>";
  }

  document.getElementById("result").innerHTML = resultText;
}
