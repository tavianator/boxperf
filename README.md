This is the code used for http://tavianator.com/java-autoboxing-performance/.
To compile and run the benchmarks,

    $ mvn clean package
    $ java -jar target/benchmarks.jar -f 1 -wi 8 -i 8

Edit [`StringAsList.java`](https://github.com/tavianator/boxperf/blob/master/src/main/java/com/tavianator/boxperf/StringAsList.java) to observe the speedup from explicit boxing.
On Linux `-prof perfasm` to see the generated assembly.
