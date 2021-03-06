/*
 * Copyright (C) 2021 Strumenta
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import com.strumenta.kotlinmultiplatform.asCharArray
import kotlin.test.*

fun assertArrayEquals(a: CharArray, b: CharArray) {
    assertEquals(a.size, b.size)
    for (i in 0..a.size) {
        assertEquals(a[i], b[i])
    }
}

class MiscStringTest {

    @Test fun testToCharArrayEmpty() {
        assertArrayEquals(charArrayOf(), "".asCharArray())
    }

    @Test fun testToCharArrayEmptyLength() {
        assertEquals(0, "".asCharArray().size)
    }

    @Test fun testToCharArrayEmptyEl0() {
        assertEquals('a', "abc def".asCharArray()[0])
    }

    @Test fun testToCharArray() {
        assertArrayEquals(charArrayOf('a', 'b', 'c', ' ', 'd', 'e', 'f'), "abc def".asCharArray())
    }

}

