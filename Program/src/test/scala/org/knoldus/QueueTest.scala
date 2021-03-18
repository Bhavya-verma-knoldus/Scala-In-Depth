// Copyright (C) 2011-2012 the original author or authors.
// See the LICENCE.txt file distributed with this work for additional
// information regarding copyright ownership.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class QueueTest extends AnyFlatSpec {

  val queue = new Queue[Int]

  /*enqueue method test cases*/
  "enqueue" should "add element when list is empty" in {
    val list = List()

    val result = queue.enqueue(list,3)
    assert(result.nonEmpty)
  }

  it should "add element when list has only 1 element" in {
    val list = List(1)

    val result = queue.enqueue(list,5)
    assert(result.nonEmpty)
  }

  it should "add element when list has more than 1 element" in {
    val list = List(1,2,3)

    val result = queue.enqueue(list,4)
    assert(result.nonEmpty)
  }
  /*enqueue method test cases ended*/
  /*---------------------------------------------------------------------------*/

  /*dequeue method test cases*/
  "dequeue" should "remove element when list has only 1 element" in {
    val list = List(1)

    val result = queue.dequeue(list)
    assert(result.isEmpty)
  }

  it should "remove element when list has more than 1 element" in {
    val list = List(1,2,3)

    val result = queue.dequeue(list)
    assert(result.nonEmpty)
  }

  it should "throw exception when list is empty" in {
    val list = List()

    assertThrows[NoSuchElementException](queue.dequeue(list))
  }
  /*dequeue method test cases ended*/
  /*---------------------------------------------------------------------------*/

  /*isEmpty method test cases*/
  "isEmpty" should "return true when list is empty" in {
    val list = List()

    assert(queue.isEmpty(list))
  }

  it should "return false when list is not empty" in {
    val list = List(1,2,3)

    assert(!queue.isEmpty(list))
  }
  /*isEmpty method test cases ended*/
  /*---------------------------------------------------------------------------*/

  /*peek method test cases*/
  "peek" should "return front element when list is not empty" in {
    val list = List(1,2,3)

    val result = queue.peek(list)
    assert(Some(result).nonEmpty)
  }

  it should "throw exception when list is empty" in {
    val list = List()

    assertThrows[NoSuchElementException](queue.peek(list))
  }
  /*peek method test cases ended*/
  /*---------------------------------------------------------------------------*/
}
