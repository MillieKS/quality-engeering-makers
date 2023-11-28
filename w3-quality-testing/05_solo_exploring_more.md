
## Challenge

This is a process feedback challenge. That means you should record yourself
doing it and submit that recording to your coach for feedback. [How do I do
this?](../pills/process_feedback_challenges.md)

In this hypothetical scenario, a program description was written up and provided
to a developer who is writing the code and unit tests. You will work from the
same description and produce test cases while the code is in development, in
order to plan some of your work. Once the code becomes available, you will use
your test cases to explore the developer's program, noting any issues you
observe. At the end, you will record your findings so that they can be passed
back to the team for review.

1. Read through the program description below, making your own notes as you go
2. Prepare 5 different test cases - an example test is shown below the program
   description; don't worry, you're not looking for "perfection" when doing
   this, just giving yourself examples you can use later
3. Start recording your challenge work at this point - record for a **maximum of
   1 hour**
4. Acquire the developer's program, available alongside this file
5. Run the developer's program, using your test cases to explore its behaviour,
   making notes as you test; N.B. you are not limited to only running the 5 test
   cases you prepared, they are starting points for you to begin exploring
6. Stop the recording
7. Summarise your findings by writing up a report including what you found with
   your test cases and a one-line summary of each of the issues observed
8. Choose one of the issues and write a paragraph or two explaining it in more
   detail, and include this in your report
9. Submit your recording, test cases and report

Remember: you are not supposed to be implementing the program!

[After you're done, submit your recording, test cases and
report](https://airtable.com/shrvo9ePjlwnaiLv5?prefill_Item=itt_as01).

### Program Description

A "wrap_it" program must take a quantity of English text and add new lines to it
so that it subsequently conforms to having no more than a maximum number of
characters on every line, and has a special marker "--END OF FILE--" denoting
the end of the output. For example, with an input of "a quick brown fox jumps
over the lazy dog" and a maximum wrapping limit of 26, the output would be:

```
a quick brown fox jumps
over the lazy dog
--END OF FILE--
```

The first line of the output above has 24 characters, so is below the limit. The
next word, "over", and subsequent words are moved onto a new line. This second
line is also below the limit and is everything left from the input text, so the
special marker is output after that.

The program therefore takes two inputs - a string of the text to be wrapped and
an integer representing the maximum wrapping limit. It outputs text to the
console.

The program is run at the command line, as shown in the following example, with
the first argument as the wrap limit, followed by the text:

// the program takes 2 arguements
// first the maximum character wrapping limit
// second the text as a 'string'


// start off small to see if the 'space' is counted expected yes == true
// Wrap limit:10
// considerations after testing behavior : spaces do count, also no dashes in special marker "--END OF FILE--" when printed
```
$ python3 wrap_it.py 10 "a quick brown fox jumps over the lazy dog"
a quick 
brown fox
jumps over
 the lazy
dog
--END OF FILE--
```

// checking if numbers are considered characters expected yes since in a string
// Wrap limit:10
```
$ python3 wrap_it.py 10 "a quick br0wn f0x jumps 0v0r the lazy d0g"
a quick 
br0wn f0x
jumps 0ver
the lazy
d0g
--END OF FILE--
```
//actually returned
//considerations after testing:- on first line it holds 11 character when the wrap limit in 10
//                             - word breaks after a number, not usual with words with just letters
```
$ python3 wrap_it.py 10 "a quick br0wn f0x jumps 0v0r the lazy d0g"
a quick br0
wn f0x
jumps 0v0r
 the lazy
d0g
END OF FILE

```
### Paragraph Description on testing

// paragraph with main focus on the test above: 
This test is one I could have explored more in terms of understanding why the 0 which was the 11th character stayed on the same line.
In future tests I noticed that word wouldn't break if it had a number in them(for example 'f0x'), it would simply take the whole word to the next line.
However, I wondered if it was because it was '0' but like I said before the test cases show that the number didn't matter because we would try other numbers.
In the test above the rest of the text would act as expected.
Another thing to note about most test cases is that they split either before or after a space but not break a word. it would just to a new line.
The tests with characters like "," or "-" seemed unaffected and acted as part of a word if there were next to a letter.
The output --END OF FILE-- didn't come out with the dashes, depends on how important this is

*************
// follow-up test to check if the word broke because of the number, change 'br0wn' to 'brown' == true
```
$ python3 wrap_it.py 10 "a quick brown f0x jumps 0v0r the lazy d0g"
a quick 
brown f0x
jumps 0v0r
 the lazy
d0g
END OF FILE

```

// what if there are no characters? Expect to return empty w/ end of file OR error
// Wrap limit:0
```
$ python3 wrap_it.py 0 ""

--END OF FILE--
```
//actually return with 2 new empty lines when passed $ python3 wrap_it.py 0 ""
```
$ python3 wrap_it.py 0 ""


--END OF FILE--
```
//actually return with 1 new empty line when passed $ python3 wrap_it.py 10 "" >> this seems to be consistent with any number above 0
```
$ python3 wrap_it.py 0 ""

--END OF FILE--
```

// testing a longer wrap limit == true
// Wrap limit:26
```
$ python3 wrap_it.py 26 "a quick brown fox jumps over the lazy dog"
a quick brown fox jumps
over the lazy dog
--END OF FILE--
```
// testing a longer wrap limit with numbers and characters == true
// Wrap limit:26
```
$ python3 wrap_it.py 26 "-a quick bro3n fox jumps over the la3y dog"
-a quick bro3n fox jumps
over the la3y dog
--END OF FILE--
```

// testing a longer wrap limit and text with different characters
// Wrap limit:26
```
$ python3 wrap_it.py 26 "a quick brown! fox jumps. over the lazy"" dog,"
a quick brown! fox jumps.
over the lazy"" dog,
--END OF FILE--
```
//actually returned
//considerations:- the ' "" 'speech marks in the string were not considered and deleted
```
$ python3 wrap_it.py 26 "a quick brown! fox jumps. over the lazy"" dog,"
a quick brown! fox jumps.
over the lazy dog,
--END OF FILE--
```
// testing if adding another speech mark would return one speech mark >> instead the string wasn't closed.
```
$ python3 wrap_it.py 26 "a quick brown! fox jumps. over the lazy""" dog,"
dquote>
dquote> 
dquote> 
dquote> 
```
//testing again but closing the string with an added speech mark.
//considerations:- the ' "" 'speech marks in the string were not considered and instead deleted/removed what is in them
//               - " dog," was removed
```
$ python3 wrap_it.py 26 "a quick brown! fox jumps. over the lazy"" dog,""
a quick brown! fox jumps.
over the lazy
--END OF FILE--
```

 
### Location

[Resources for this exercise](05_resources).

> Please don't open the file to read the code. The idea of this exercise is that
> you're testing it _without_ knowing how it has been implemented.

### Example Test

The following is an example of how you should write your test cases. Test cases
can take many forms, but you should follow this layout for the 5 you create for
this challenge.

```
Test purpose:

See whether the example in the program description produces the output it says it should

Text input:

a quick brown fox jumps over the lazy dog

Wrap limit:

26

Expected output:

a quick brown fox jumps
over the lazy dog
--END OF FILE--
```

[Next Challenge](06_materials.md)

<!-- BEGIN GENERATED SECTION DO NOT EDIT -->

---

**How was this resource?**  
[😫](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fintro-to-testing&prefill_File=phase2%2F05_solo_exploring_more.md&prefill_Sentiment=😫) [😕](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fintro-to-testing&prefill_File=phase2%2F05_solo_exploring_more.md&prefill_Sentiment=😕) [😐](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fintro-to-testing&prefill_File=phase2%2F05_solo_exploring_more.md&prefill_Sentiment=😐) [🙂](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fintro-to-testing&prefill_File=phase2%2F05_solo_exploring_more.md&prefill_Sentiment=🙂) [😀](https://airtable.com/shrUJ3t7KLMqVRFKR?prefill_Repository=makersacademy%2Fintro-to-testing&prefill_File=phase2%2F05_solo_exploring_more.md&prefill_Sentiment=😀)  
Click an emoji to tell us.

<!-- END GENERATED SECTION DO NOT EDIT -->
