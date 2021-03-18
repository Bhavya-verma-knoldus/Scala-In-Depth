# Queue

## What is Queue?
A Queue is a linear structure which follows a particular order in which the operations are performed. The order is First In First Out (FIFO). A good example of a queue is any queue of consumers for a resource where the consumer that came first is served first.

## Description
I have created a Generic Queue class which performs all the operations of queue and it works on immutable data structure.

## Methods
* enqueue - add element to the queue
* dequeue - remove element from the queue
* isEmpty - checks whether queue is empty or not
* peek - to view the head of the queue

## Commands

### Compile code
```bash
sbt compile
```

### Delete all generated files
```bash
sbt clean
```

### Generate scalastyle config file
```bash
sbt scalastyleGenerateConfig
```

### Execute scalastyle plugin
```bash
sbt scalastyle
```

### Execute scalastyle plugin for test cases
```bash
sbt test:scalastyle
```

### Run the tests with enabled coverage
```bash
sbt clean coverage test
```

### To generate the coverage reports
```bash
sbt coverageReport
```