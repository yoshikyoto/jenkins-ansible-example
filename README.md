# Ansible Jenkins Example

AnsibleでJenkinsサーバーを構築する例

# 実行環境

Cent OS 7 で動作確認していますので他のOSでは動かない可能性があります。

# 実行例

```.sh
$ ansible-playbook playbook/jenkins-master.yml -u root --ask-pass --ask-sudo-pass

SSH password: #rootのパスワードを入力
SUDO password[defaults to SSH password]: #rootのパスワードを入力
```

# jenkins-master とは

jenkins-slaveに対するjenkins-masterです。jenkins-slaveを使っていなければ何も気にしなくていいです。
