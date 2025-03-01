# EXER3
This is a user manual on how to run the exer3 program. This is a simple Flask-based backend API that provides server information such as the operating system, OS version, and the client's IP address.

# Routes
This program includes **4 routes**
1. **`/os`** - Returns the operating system of the server.
2. **`/version`** - Returns the OS version of the server.
3. **`/ip`** - Returns the IP address of the client making the request.
4. **`/all`** - Returns all the above information in a single JSON response.

## Prerequisites
Before running the program, ensure you have the following installed:
- **Python 3.x**: Download and install Python from [python.org](https://www.python.org/).
- **pip**: Python's package installer (usually comes pre-installed with Python).

## Running the Program
1. **Clone the Repository** (if applicable):
   Open Command Prompt and run:
   ```bash
   git clone https://github.com/CS125-2nd-sem-2025/CARO.git
   cd exer3
   ```

2. **Create a virtual environment** (this is optional, but highly recommended):
   Run the following commands to create and activate a virtual environment:
   ```bash
   python -m venv venv
   venv\Scripts\activate # On Linux/macOS, use source venv/bin/activate
   ```

3. **Install Dependencies**:
   Install Flask using pip: 
   ```bash
   pip install Flask
   ```
   
4. **Run the Application**:
   Start the Flask development server:
   ```bash
   python app.py
   ```

## Usage
Once the application is running, you can access the API endpoints using your web browser:

1. **Get OS information**:
   - Open [http://127.0.0.1:5000/os](http://127.0.0.1:5000/os) 

2. **Get OS version**:
   - Open [http://127.0.0.1:5000/version](http://127.0.0.1:5000/version) 

3. **Get client IP**:
   - Open [http://127.0.0.1:5000/ip](http://127.0.0.1:5000/ip) 

4. **Get all information**:
   - Open [http://127.0.0.1:5000/all](http://127.0.0.1:5000/all) 

## Troubleshooting
If you encounter any issues:

- Make sure Flask is installed correctly
- Check that port 5000 is not already in use
- Ensure your firewall is not blocking the connection