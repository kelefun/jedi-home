    <#if result>
    {
    "code": ${result.code!'200'},
    "msg": "${result.msg!""}",
    "success": false
    }
    <#else>
    {
    "code": "500",
    "msg": "UNEXPECTED_EXCEPTION",
    "success": false,
    }
    </#if>