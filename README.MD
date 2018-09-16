we want to be able to call

```
    $> app --help
    $> app map --help
    $> app map get myKey
    $> app map set myKey
    $> app map clear
    $> app echo --help
    $> app echo "this is what to echo"
```

now how would we do these same things springishly?

```
    $> app --cmd.showHelp=true
    $> app --cmd.map.execute=true --cmd.map.showHelp=true
    $> app --cmd.active=map --cmd.map.cmd.active=get --cmd.map.cmd.get.key=myKey
```

hmm...

only one thing at a time can actually EVER be executing,
so it makes a lot more sense to think of it in recursive terms.

This means,

```yaml
cmd:
    active: map
    map:
      cmd:
          active: get
          get:
            key: myKey
          set:
            key:
            value:
    echo:
      text:
```