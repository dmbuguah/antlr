grammar Assign;
stat: assign // First alternative ('|' is alternative separator)
    | ifstat // Second alternative
    | whilestat
    ;
