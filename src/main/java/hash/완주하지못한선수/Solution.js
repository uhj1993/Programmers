// 내가 한 풀이

function solution(participant, completion) {
  participant.sort();
  completion.sort();

  for (var a = 0; a <= participant.length; a++) {
    if (participant[a] != completion[a]) return participant[a];
  }
}

// 베스트 풀이
var solution = (participant, completion) =>
  participant.find(
    (name) => !completion[name]--,
    completion.map((name) => (completion[name] = (completion[name] | 0) + 1))
  );

var solution = (participant, completion) => {
  completion.map((name) => (completion[name] = (completion[name] | 0) + 1));
  return participant.find((name) => !completion[name]--);
};
