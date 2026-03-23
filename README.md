# 📧 EmailScrapper

A powerful and lightweight Python-based email extraction tool designed to collect email addresses from text files and web pages using regex and web scraping techniques.

---

## 🚀 Overview

EmailScrapper is a practical automation tool built to extract email addresses efficiently from multiple sources. It supports both local file parsing and live website scraping, making it useful for data collection, research, and cybersecurity-related reconnaissance tasks.

The project demonstrates the application of Python programming, pattern matching, and web scraping to solve real-world data extraction problems.

---

## ✨ Key Features

- 🔍 Extracts email addresses from text files and web pages
- 🌐 Supports URL-based live web scraping
- ⚡ Fast and efficient processing
- 🎯 Accurate detection using Regular Expressions (Regex)
- 📁 Saves extracted emails into organized output files
- 🧩 Modular and easy to extend
- 🖥️ Simple command-line interface

---

## 🎯 Use Cases

- 📊 Data collection and analysis
- 📬 Building contact datasets
- 🧹 Cleaning and processing email lists
- 🤖 Automation workflows
- 🧪 Learning web scraping and regex techniques
- 🔐 Basic reconnaissance in cybersecurity

---

## ⚙️ How It Works

EmailScrapper operates in two main modes:

### 📄 File Mode
- Takes a local text file as input
- Scans the content using regex
- Extracts all valid email patterns

### 🌐 URL Mode
- Takes a website URL as input
- Sends HTTP requests to fetch page content
- Parses HTML using BeautifulSoup
- Extracts emails from the webpage

---

## 🛠️ Installation

Clone the repository:

```bash
git clone https://github.com/Suryao07/EmailScrapper.git
cd EmailScrapper

Install dependencies:

pip install -r requirements.txt
▶️ Usage

Run the script:

python main.py

Then choose input type:

File path
Website URL

The extracted emails will be automatically saved in an output file.

📦 Requirements
Python 3.x
requests
beautifulsoup4
🧪 Example Workflow
Input a website URL
Tool fetches page content
Parses HTML structure
Extracts emails using regex
Saves results to output file
🔮 Future Enhancements
🔁 Duplicate email removal
🧠 Email validation system
📊 Export to CSV / JSON formats
🌍 Domain-based filtering
📄 Support for PDF and DOCX parsing
⚡ Multi-threading for faster processing
🧠 Skills Demonstrated
Python Programming
Web Scraping
Regular Expressions (Regex)
Data Extraction
Automation
👤 Author

Surya Pratap Singh
Cybersecurity Enthusiast | Web Security | Aspiring Red Teamer

GitHub: https://github.com/Suryao07
