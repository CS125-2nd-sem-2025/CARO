from flask import Flask, jsonify, request
import platform
import socket

app = Flask(__name__)

@app.route('/', methods=['GET'])
def root():
    return 'Hello, Exer3'

@app.route('/os', methods=['GET'])
def get_os():
    os_name = platform.system()
    return jsonify({'os': os_name})

@app.route('/version', methods=['GET'])
def get_version():
    os_version = platform.version()
    return jsonify({'version': os_version})

@app.route('/ip', methods=['GET'])
def get_ip():
    client_ip = request.remote_addr
    return jsonify({'ip': client_ip})

@app.route('/all', methods=['GET'])
def get_all():
    os_name = platform.system()
    os_version = platform.version()
    client_ip = request.remote_addr
    return jsonify({
        'os': os_name,
        'version': os_version,
        'ip': client_ip
    })

if __name__ == '__main__':
    app.run(debug=True)