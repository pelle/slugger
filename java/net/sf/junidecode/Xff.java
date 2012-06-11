/*
 * Copyright (c) 2009, Giuseppe Cardone <ippatsuman@gmail.com>
 * All rights reserved.
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *  * Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *  * Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *  * Neither the name of the author nor the names of the contributors may be
 *    used to endorse or promote products derived from this software without
 *    specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY GIUSEPPE CARDONE ''AS IS'' AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL GIUSEPPE CARDONE BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 */
package net.sf.junidecode;

/**
 * Character map for Unicode characters with codepoint U+FFxx.
 * @author Giuseppe Cardone
 * @version 0.1
 */
class Xff {

    public static final String[] map = new String[]{
        "[?]", // 0x00
        "!", // 0x01
        "\"", // 0x02
        "#", // 0x03
        "$", // 0x04
        "%", // 0x05
        "&", // 0x06
        "\'", // 0x07
        "(", // 0x08
        ")", // 0x09
        "*", // 0x0a
        "+", // 0x0b
        ",", // 0x0c
        "-", // 0x0d
        ".", // 0x0e
        "/", // 0x0f
        "0", // 0x10
        "1", // 0x11
        "2", // 0x12
        "3", // 0x13
        "4", // 0x14
        "5", // 0x15
        "6", // 0x16
        "7", // 0x17
        "8", // 0x18
        "9", // 0x19
        ":", // 0x1a
        ";", // 0x1b
        "<", // 0x1c
        "=", // 0x1d
        ">", // 0x1e
        "?", // 0x1f
        "@", // 0x20
        "A", // 0x21
        "B", // 0x22
        "C", // 0x23
        "D", // 0x24
        "E", // 0x25
        "F", // 0x26
        "G", // 0x27
        "H", // 0x28
        "I", // 0x29
        "J", // 0x2a
        "K", // 0x2b
        "L", // 0x2c
        "M", // 0x2d
        "N", // 0x2e
        "O", // 0x2f
        "P", // 0x30
        "Q", // 0x31
        "R", // 0x32
        "S", // 0x33
        "T", // 0x34
        "U", // 0x35
        "V", // 0x36
        "W", // 0x37
        "X", // 0x38
        "Y", // 0x39
        "Z", // 0x3a
        "[", // 0x3b
        "\\", // 0x3c
        "]", // 0x3d
        "^", // 0x3e
        "_", // 0x3f
        "`", // 0x40
        "a", // 0x41
        "b", // 0x42
        "c", // 0x43
        "d", // 0x44
        "e", // 0x45
        "f", // 0x46
        "g", // 0x47
        "h", // 0x48
        "i", // 0x49
        "j", // 0x4a
        "k", // 0x4b
        "l", // 0x4c
        "m", // 0x4d
        "n", // 0x4e
        "o", // 0x4f
        "p", // 0x50
        "q", // 0x51
        "r", // 0x52
        "s", // 0x53
        "t", // 0x54
        "u", // 0x55
        "v", // 0x56
        "w", // 0x57
        "x", // 0x58
        "y", // 0x59
        "z", // 0x5a
        "{", // 0x5b
        "|", // 0x5c
        "}", // 0x5d
        "~", // 0x5e
        "[?]", // 0x5f
        "[?]", // 0x60
        ".", // 0x61
        "[", // 0x62
        "]", // 0x63
        ",", // 0x64
        "*", // 0x65
        "wo", // 0x66
        "a", // 0x67
        "i", // 0x68
        "u", // 0x69
        "e", // 0x6a
        "o", // 0x6b
        "ya", // 0x6c
        "yu", // 0x6d
        "yo", // 0x6e
        "tu", // 0x6f
        "+", // 0x70
        "a", // 0x71
        "i", // 0x72
        "u", // 0x73
        "e", // 0x74
        "o", // 0x75
        "ka", // 0x76
        "ki", // 0x77
        "ku", // 0x78
        "ke", // 0x79
        "ko", // 0x7a
        "sa", // 0x7b
        "si", // 0x7c
        "su", // 0x7d
        "se", // 0x7e
        "so", // 0x7f
        "ta", // 0x80
        "ti", // 0x81
        "tu", // 0x82
        "te", // 0x83
        "to", // 0x84
        "na", // 0x85
        "ni", // 0x86
        "nu", // 0x87
        "ne", // 0x88
        "no", // 0x89
        "ha", // 0x8a
        "hi", // 0x8b
        "hu", // 0x8c
        "he", // 0x8d
        "ho", // 0x8e
        "ma", // 0x8f
        "mi", // 0x90
        "mu", // 0x91
        "me", // 0x92
        "mo", // 0x93
        "ya", // 0x94
        "yu", // 0x95
        "yo", // 0x96
        "ra", // 0x97
        "ri", // 0x98
        "ru", // 0x99
        "re", // 0x9a
        "ro", // 0x9b
        "wa", // 0x9c
        "n", // 0x9d
        ":", // 0x9e
        ";", // 0x9f
        "", // 0xa0
        "g", // 0xa1
        "gg", // 0xa2
        "gs", // 0xa3
        "n", // 0xa4
        "nj", // 0xa5
        "nh", // 0xa6
        "d", // 0xa7
        "dd", // 0xa8
        "r", // 0xa9
        "lg", // 0xaa
        "lm", // 0xab
        "lb", // 0xac
        "ls", // 0xad
        "lt", // 0xae
        "lp", // 0xaf
        "rh", // 0xb0
        "m", // 0xb1
        "b", // 0xb2
        "bb", // 0xb3
        "bs", // 0xb4
        "s", // 0xb5
        "ss", // 0xb6
        "", // 0xb7
        "j", // 0xb8
        "jj", // 0xb9
        "c", // 0xba
        "k", // 0xbb
        "t", // 0xbc
        "p", // 0xbd
        "h", // 0xbe
        "[?]", // 0xbf
        "[?]", // 0xc0
        "[?]", // 0xc1
        "a", // 0xc2
        "ae", // 0xc3
        "ya", // 0xc4
        "yae", // 0xc5
        "eo", // 0xc6
        "e", // 0xc7
        "[?]", // 0xc8
        "[?]", // 0xc9
        "yeo", // 0xca
        "ye", // 0xcb
        "o", // 0xcc
        "wa", // 0xcd
        "wae", // 0xce
        "oe", // 0xcf
        "[?]", // 0xd0
        "[?]", // 0xd1
        "yo", // 0xd2
        "u", // 0xd3
        "weo", // 0xd4
        "we", // 0xd5
        "wi", // 0xd6
        "yu", // 0xd7
        "[?]", // 0xd8
        "[?]", // 0xd9
        "eu", // 0xda
        "yi", // 0xdb
        "i", // 0xdc
        "[?]", // 0xdd
        "[?]", // 0xde
        "[?]", // 0xdf
        "/C", // 0xe0
        "PS", // 0xe1
        "!", // 0xe2
        "-", // 0xe3
        "|", // 0xe4
        "Y=", // 0xe5
        "W=", // 0xe6
        "[?]", // 0xe7
        "|", // 0xe8
        "-", // 0xe9
        "|", // 0xea
        "-", // 0xeb
        "|", // 0xec
        "#", // 0xed
        "O", // 0xee
        "[?]", // 0xef
        "[?]", // 0xf0
        "[?]", // 0xf1
        "[?]", // 0xf2
        "[?]", // 0xf3
        "[?]", // 0xf4
        "[?]", // 0xf5
        "[?]", // 0xf6
        "[?]", // 0xf7
        "[?]", // 0xf8
        "{", // 0xf9
        "|", // 0xfa
        "}", // 0xfb
        "", // 0xfc
        "", // 0xfd
        "", // 0xfe
        "" // 0xff
    };
}
