package com.blankj.utilcode.constant

/**
 * <pre>
 * author: Blankj
 * blog  : http://blankj.com
 * time  : 2017/03/13
 * desc  : The constants of regex
</pre> *
 */
object RegexConstants {

    /**
     * regex of simple mobile
     */
    val REGEX_MOBILE_SIMPLE = "^[1]\\d{10}$"
    /**
     * regex of exact mobile
     *
     * china mobile: 134(0-8), 135, 136, 137, 138, 139, 147, 150, 151, 152, 157, 158, 159, 178, 182, 183, 184, 187, 188, 198
     *
     * china unicom: 130, 131, 132, 145, 155, 156, 166, 171, 175, 176, 185, 186
     *
     * china telecom: 133, 153, 173, 177, 180, 181, 189, 199
     *
     * global star: 1349
     *
     * virtual operator: 170
     */
    val REGEX_MOBILE_EXACT = "^((13[0-9])|(14[5,7])|(15[0-3,5-9])|(16[6])|(17[0,1,3,5-8])|(18[0-9])|(19[8,9]))\\d{8}$"
    /**
     * regex of telephone number
     */
    val REGEX_TEL = "^0\\d{2,3}[- ]?\\d{7,8}"
    /**
     * regex of id card number which length is 15
     */
    val REGEX_ID_CARD15 = "^[1-9]\\d{7}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}$"
    /**
     * regex of id card number which length is 18
     */
    val REGEX_ID_CARD18 = "^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}([0-9Xx])$"
    /**
     * regex of email
     */
    val REGEX_EMAIL = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$"
    /**
     * regex of url
     */
    val REGEX_URL = "[a-zA-z]+://[^\\s]*"
    /**
     * regex of Chinese character
     */
    val REGEX_ZH = "^[\\u4e00-\\u9fa5]+$"
    /**
     * regex of username
     *
     * scope for "a-z", "A-Z", "0-9", "_", "Chinese character"
     *
     * can't end with "_"
     *
     * length is between 6 to 20
     */
    val REGEX_USERNAME = "^[\\w\\u4e00-\\u9fa5]{6,20}(?<!_)$"
    /**
     * regex of date which pattern is "yyyy-MM-dd"
     */
    val REGEX_DATE = "^(?:(?!0000)[0-9]{4}-(?:(?:0[1-9]|1[0-2])-(?:0[1-9]|1[0-9]|2[0-8])|(?:0[13-9]|1[0-2])-(?:29|30)|(?:0[13578]|1[02])-31)|(?:[0-9]{2}(?:0[48]|[2468][048]|[13579][26])|(?:0[48]|[2468][048]|[13579][26])00)-02-29)$"
    /**
     * regex of ip address
     */
    val REGEX_IP = "((2[0-4]\\d|25[0-5]|[01]?\\d\\d?)\\.){3}(2[0-4]\\d|25[0-5]|[01]?\\d\\d?)"

    ///////////////////////////////////////////////////////////////////////////
    // the following comes from http://tool.oschina.net/regex
    ///////////////////////////////////////////////////////////////////////////

    /**
     * regex of double-byte characters
     */
    val REGEX_DOUBLE_BYTE_CHAR = "[^\\x00-\\xff]"
    /**
     * regex of blank line
     */
    val REGEX_BLANK_LINE = "\\n\\s*\\r"
    /**
     * regex of QQ number
     */
    val REGEX_QQ_NUM = "[1-9][0-9]{4,}"
    /**
     * regex of postal code in China
     */
    val REGEX_CHINA_POSTAL_CODE = "[1-9]\\d{5}(?!\\d)"
    /**
     * regex of positive integer
     */
    val REGEX_POSITIVE_INTEGER = "^[1-9]\\d*$"
    /**
     * regex of negative integer
     */
    val REGEX_NEGATIVE_INTEGER = "^-[1-9]\\d*$"
    /**
     * regex of integer
     */
    val REGEX_INTEGER = "^-?[1-9]\\d*$"
    /**
     * regex of non-negative integer
     */
    val REGEX_NOT_NEGATIVE_INTEGER = "^[1-9]\\d*|0$"
    /**
     * regex of non-positive integer
     */
    val REGEX_NOT_POSITIVE_INTEGER = "^-[1-9]\\d*|0$"
    /**
     * regex of positive float
     */
    val REGEX_POSITIVE_FLOAT = "^[1-9]\\d*\\.\\d*|0\\.\\d*[1-9]\\d*$"
    /**
     * regex of negative float
     */
    val REGEX_NEGATIVE_FLOAT = "^-[1-9]\\d*\\.\\d*|-0\\.\\d*[1-9]\\d*$"

    ///////////////////////////////////////////////////////////////////////////
    // If u want more please visit http://toutiao.com/i6231678548520731137
    ///////////////////////////////////////////////////////////////////////////
}
