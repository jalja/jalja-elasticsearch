<@compress single_line=true>
{
    "query": {
        "bool": {
                "must": [
                
                 <#if loanApplyId??>
                        {
                            "term":{
                                "t_loan_status|apply_id":${loanApplyId?c}
                            }
                        }
                 </#if>       

                ]
            }
    },
    "from": 0,
    "size": 5,
    "sort": {
    "t_loan_apply|id": {
        "order": "desc"
        }
    }
}
</@compress>