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
 * Character map for Unicode characters with codepoint U+CFxx.
 * @author Giuseppe Cardone
 * @version 0.1
 */
class Xcf {

    public static final String[] map = new String[]{
        "ke", // 0x00
        "keg", // 0x01
        "kegg", // 0x02
        "kegs", // 0x03
        "ken", // 0x04
        "kenj", // 0x05
        "kenh", // 0x06
        "ked", // 0x07
        "kel", // 0x08
        "kelg", // 0x09
        "kelm", // 0x0a
        "kelb", // 0x0b
        "kels", // 0x0c
        "kelt", // 0x0d
        "kelp", // 0x0e
        "kelh", // 0x0f
        "kem", // 0x10
        "keb", // 0x11
        "kebs", // 0x12
        "kes", // 0x13
        "kess", // 0x14
        "keng", // 0x15
        "kej", // 0x16
        "kec", // 0x17
        "kek", // 0x18
        "ket", // 0x19
        "kep", // 0x1a
        "keh", // 0x1b
        "kyeo", // 0x1c
        "kyeog", // 0x1d
        "kyeogg", // 0x1e
        "kyeogs", // 0x1f
        "kyeon", // 0x20
        "kyeonj", // 0x21
        "kyeonh", // 0x22
        "kyeod", // 0x23
        "kyeol", // 0x24
        "kyeolg", // 0x25
        "kyeolm", // 0x26
        "kyeolb", // 0x27
        "kyeols", // 0x28
        "kyeolt", // 0x29
        "kyeolp", // 0x2a
        "kyeolh", // 0x2b
        "kyeom", // 0x2c
        "kyeob", // 0x2d
        "kyeobs", // 0x2e
        "kyeos", // 0x2f
        "kyeoss", // 0x30
        "kyeong", // 0x31
        "kyeoj", // 0x32
        "kyeoc", // 0x33
        "kyeok", // 0x34
        "kyeot", // 0x35
        "kyeop", // 0x36
        "kyeoh", // 0x37
        "kye", // 0x38
        "kyeg", // 0x39
        "kyegg", // 0x3a
        "kyegs", // 0x3b
        "kyen", // 0x3c
        "kyenj", // 0x3d
        "kyenh", // 0x3e
        "kyed", // 0x3f
        "kyel", // 0x40
        "kyelg", // 0x41
        "kyelm", // 0x42
        "kyelb", // 0x43
        "kyels", // 0x44
        "kyelt", // 0x45
        "kyelp", // 0x46
        "kyelh", // 0x47
        "kyem", // 0x48
        "kyeb", // 0x49
        "kyebs", // 0x4a
        "kyes", // 0x4b
        "kyess", // 0x4c
        "kyeng", // 0x4d
        "kyej", // 0x4e
        "kyec", // 0x4f
        "kyek", // 0x50
        "kyet", // 0x51
        "kyep", // 0x52
        "kyeh", // 0x53
        "ko", // 0x54
        "kog", // 0x55
        "kogg", // 0x56
        "kogs", // 0x57
        "kon", // 0x58
        "konj", // 0x59
        "konh", // 0x5a
        "kod", // 0x5b
        "kol", // 0x5c
        "kolg", // 0x5d
        "kolm", // 0x5e
        "kolb", // 0x5f
        "kols", // 0x60
        "kolt", // 0x61
        "kolp", // 0x62
        "kolh", // 0x63
        "kom", // 0x64
        "kob", // 0x65
        "kobs", // 0x66
        "kos", // 0x67
        "koss", // 0x68
        "kong", // 0x69
        "koj", // 0x6a
        "koc", // 0x6b
        "kok", // 0x6c
        "kot", // 0x6d
        "kop", // 0x6e
        "koh", // 0x6f
        "kwa", // 0x70
        "kwag", // 0x71
        "kwagg", // 0x72
        "kwags", // 0x73
        "kwan", // 0x74
        "kwanj", // 0x75
        "kwanh", // 0x76
        "kwad", // 0x77
        "kwal", // 0x78
        "kwalg", // 0x79
        "kwalm", // 0x7a
        "kwalb", // 0x7b
        "kwals", // 0x7c
        "kwalt", // 0x7d
        "kwalp", // 0x7e
        "kwalh", // 0x7f
        "kwam", // 0x80
        "kwab", // 0x81
        "kwabs", // 0x82
        "kwas", // 0x83
        "kwass", // 0x84
        "kwang", // 0x85
        "kwaj", // 0x86
        "kwac", // 0x87
        "kwak", // 0x88
        "kwat", // 0x89
        "kwap", // 0x8a
        "kwah", // 0x8b
        "kwae", // 0x8c
        "kwaeg", // 0x8d
        "kwaegg", // 0x8e
        "kwaegs", // 0x8f
        "kwaen", // 0x90
        "kwaenj", // 0x91
        "kwaenh", // 0x92
        "kwaed", // 0x93
        "kwael", // 0x94
        "kwaelg", // 0x95
        "kwaelm", // 0x96
        "kwaelb", // 0x97
        "kwaels", // 0x98
        "kwaelt", // 0x99
        "kwaelp", // 0x9a
        "kwaelh", // 0x9b
        "kwaem", // 0x9c
        "kwaeb", // 0x9d
        "kwaebs", // 0x9e
        "kwaes", // 0x9f
        "kwaess", // 0xa0
        "kwaeng", // 0xa1
        "kwaej", // 0xa2
        "kwaec", // 0xa3
        "kwaek", // 0xa4
        "kwaet", // 0xa5
        "kwaep", // 0xa6
        "kwaeh", // 0xa7
        "koe", // 0xa8
        "koeg", // 0xa9
        "koegg", // 0xaa
        "koegs", // 0xab
        "koen", // 0xac
        "koenj", // 0xad
        "koenh", // 0xae
        "koed", // 0xaf
        "koel", // 0xb0
        "koelg", // 0xb1
        "koelm", // 0xb2
        "koelb", // 0xb3
        "koels", // 0xb4
        "koelt", // 0xb5
        "koelp", // 0xb6
        "koelh", // 0xb7
        "koem", // 0xb8
        "koeb", // 0xb9
        "koebs", // 0xba
        "koes", // 0xbb
        "koess", // 0xbc
        "koeng", // 0xbd
        "koej", // 0xbe
        "koec", // 0xbf
        "koek", // 0xc0
        "koet", // 0xc1
        "koep", // 0xc2
        "koeh", // 0xc3
        "kyo", // 0xc4
        "kyog", // 0xc5
        "kyogg", // 0xc6
        "kyogs", // 0xc7
        "kyon", // 0xc8
        "kyonj", // 0xc9
        "kyonh", // 0xca
        "kyod", // 0xcb
        "kyol", // 0xcc
        "kyolg", // 0xcd
        "kyolm", // 0xce
        "kyolb", // 0xcf
        "kyols", // 0xd0
        "kyolt", // 0xd1
        "kyolp", // 0xd2
        "kyolh", // 0xd3
        "kyom", // 0xd4
        "kyob", // 0xd5
        "kyobs", // 0xd6
        "kyos", // 0xd7
        "kyoss", // 0xd8
        "kyong", // 0xd9
        "kyoj", // 0xda
        "kyoc", // 0xdb
        "kyok", // 0xdc
        "kyot", // 0xdd
        "kyop", // 0xde
        "kyoh", // 0xdf
        "ku", // 0xe0
        "kug", // 0xe1
        "kugg", // 0xe2
        "kugs", // 0xe3
        "kun", // 0xe4
        "kunj", // 0xe5
        "kunh", // 0xe6
        "kud", // 0xe7
        "kul", // 0xe8
        "kulg", // 0xe9
        "kulm", // 0xea
        "kulb", // 0xeb
        "kuls", // 0xec
        "kult", // 0xed
        "kulp", // 0xee
        "kulh", // 0xef
        "kum", // 0xf0
        "kub", // 0xf1
        "kubs", // 0xf2
        "kus", // 0xf3
        "kuss", // 0xf4
        "kung", // 0xf5
        "kuj", // 0xf6
        "kuc", // 0xf7
        "kuk", // 0xf8
        "kut", // 0xf9
        "kup", // 0xfa
        "kuh", // 0xfb
        "kweo", // 0xfc
        "kweog", // 0xfd
        "kweogg", // 0xfe
        "kweogs" // 0xff
    };
}
