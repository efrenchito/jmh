/*
 * Copyright (c) 2014, Oracle America, Inc.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 *  * Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *
 *  * Neither the name of Oracle nor the names of its contributors may be used
 *    to endorse or promote products derived from this software without
 *    specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF
 * THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.nerfe;

import org.openjdk.jmh.annotations.Benchmark;

/**
 *  MyBenchmark
 *  After creating the JMH Maven Project...
 *  We'll be ready to start actually evaluating our code now...
 *  Because we've got code that already exists in another project that we want to test,
 *  we actually have two options here:
 *  -> We could just copy and paste the code from our benchmark and put it into this project.
 *  -> Or we could create a jar file and integrate the jar file in.
 *
 *  Let's first copy our PrimeNumber class into our project...
 *  We're going to add methods that invoke our code multiple times and annotate it with @Benchmark
 *  Notice that this artifact comes with a MyBenchmark example, so comment that method to avoid slowing things down
 *
 *  In order to see the benchmark stats we need to...
 *  o First build a Runnable jar file
 *    => $mvn clean install
 *    This will create a '~/target' folder for us, and inside it there will be a benchmarks.jar
 *
 *  [terminal]
 *  $ cd ~/{workspace}/jmh/target
 *  $ java -jar benchmarks.jar
 *  $ java -jar benchmarks.jar -bm avgt  (Average time mode)
 *
 *  The default benchmark mode allws us to know... How many times you can call that method in a fixed time period
 *  The benchmark mode '-bm avgt'  allows us to know how long does it take to run being more meaningful..
 *
 *  Notice that this run could take until 15 minutes to run...
 *
 *
 */

public class MyBenchmark {

    //@Benchmark
    public void testMethod() {
        // This is a demo/sample template for building your JMH benchmarks. Edit as needed.
        // Put your benchmark code here.
    }

}
