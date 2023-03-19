import logging
import json
import azure.functions as func

def main(req: func.HttpRequest) -> func.HttpResponse:

    name = req.params.get('name')
    if not name:
        try:
            req_body = req.get_json()
        except ValueError:
            pass
        else:
            name = req_body.get('name')

    #file = f'{dest_root_url}'
    #df = dd.read_parquet(file, storage_options={'anon': False}).compute()
   
 #    result = df.to_json(orient='records', date_format='iso', date_unit='s')
 #    parsed = json.loads(result)

 #    response = {
 #        'pagination': {
 #            },
 #        'result': parsed
 #    }

    if name:
        return func.HttpResponse(f"Hello, {name}. ")
    else:
        return func.HttpResponse(
             "This HTTP triggered function executed successfully. Pass a name in the query string or in the request body for a personalized response.",
             status_code=200
        )
