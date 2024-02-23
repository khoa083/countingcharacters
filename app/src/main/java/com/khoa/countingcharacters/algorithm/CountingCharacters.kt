package com.khoa.countingcharacters.algorithm

fun main(args: Array<String>) {
    print("Nhập chuỗi: ")
    val str: String? = readLine()
    println("${countingCharacters(str?:"").size} ${countingCharacters(str?:"")}")
}

// Độ phức tạp thuật toán là O(n)
fun countingCharacters(str: String): ArrayList<String>{
    val characters = arrayOf("aw","aa","dd","ee","ow","w","oo")
    val arrVietNam = arrayListOf<String>()
    var temp = 0


    for (i in 0 until str.length ) {
        val firstChar = str[i]
        val nextChar = if ((i+1) < str.length ) str[i+1] else ""


        if (characters.contains("$firstChar$nextChar")) {
            if(i == temp || "$firstChar$nextChar" == "$firstChar") {
                continue
            }
            arrVietNam.add("$firstChar$nextChar")
            temp = i+1
            continue
        }
        if (characters.contains("$nextChar")) {
            arrVietNam.add("$nextChar")
        }

    }
    return arrVietNam
}