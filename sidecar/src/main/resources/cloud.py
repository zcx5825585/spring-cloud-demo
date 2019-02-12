import json
from flask import Flask, Response,request


app = Flask(__name__)
@app.route("/health")
def health():
    result = {'status': 'UP'}
    return Response(json.dumps(result), mimetype='application/json')
	
@app.route('/test')
def test():
    print(request.args.get('name'))
    return Response(json.dumps({'name': 'zcx'}), mimetype='application/json')
	
app.run(port=3000, host='0.0.0.0')