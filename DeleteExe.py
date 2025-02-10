import os

def find_exe_files(directory):
    exe_files = []
    for root, dirs, files in os.walk(directory):
        for file in files:
            if file.endswith('.class'):
                exe_files.append(os.path.join(root, file))

    return exe_files

if __name__ == "__main__":
    directory = r"C:\CRANES_JAVA"
    exe_files = find_exe_files(directory)
    for exe_file in exe_files:
        print(exe_file+ " -- DELETED --")
        os.remove(exe_file)