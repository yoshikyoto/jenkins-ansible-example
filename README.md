# Ansible for Jenkins

Ansible Example for Jenkins.

# environment

I tested this on Cent OS 7.

I don't know if it works correctly on the other OSs.

# Execute

```.sh
$ ansible-playbook playbook/jenkins-master.yml -u root --ask-pass --ask-sudo-pass

SSH password: # enter root password
SUDO password[defaults to SSH password]: # enter root password
```

# What is the word "jenkins-master"

Jenkins has role "master" or "slave".

jenkins-slaveに対するjenkins-masterです。jenkins-slaveを使っていなければ何も気にしなくていいです。
