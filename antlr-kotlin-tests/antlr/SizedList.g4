grammar SizedList;

stringList:
  size=int
  items=stringSequence[$size.value]
  EOF;

int returns [value: Int]:
  NUM
  {
    $value = $NUM.text.toInt()
  };

stringSequence[count: Int] returns [value: MutableList<String>] locals [remaining: Int]:
    {
        $value = mutableListOf<String>()
        $remaining = $count
    }
    (
        {$remaining!! > 0}? STRING
        {
            $value!! += $STRING.text
            $remaining = $remaining!! - 1
        }
    )*;

STRING: [a-z]+;
NUM: [0-9]+;
WHITESPACE: [ \t\r\n]+ -> skip;