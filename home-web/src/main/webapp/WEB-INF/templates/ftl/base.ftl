<#macro base result data>
<#if result>
{<#if !data><#assign data = result.data/></#if>
"code": ${result.code!'200'},
"msg": "${result.msg!""}",
"success": ${result.isSuccess()?string('true','false')},
<#if result.totalItem>
"totalItem": ${result.totalItem!0},
"pageIndex": ${result.pageIndex!0},
"pageSize": ${result.pageSize!0},
"totalPage": ${result.totalPage!0},
</#if>
"data": <#nested>
}
<#else>
{
"code": "200",
"msg": "success",
"success": true,
"data": <#nested>
}
</#if>
</#macro>