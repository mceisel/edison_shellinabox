# edison_shellinabox
yocto bb recipe for shell in a box.  Which is a browser based ssh terminal

# Install precompiled binary
  Using host pc CLI and file transfer tool (ex. scp) copy the shellinabox_2.14-r0_core2-32.ipk to the edison.
  Then install package with 'opkg install shellinabox_2.14-r0_core2-32.ipk'
  Note: once installed the shell can be accessed over any ip interface that your host pc can reach. Examples over RNDIS: edison   .local:4488, or 192,168.2.14:4488. Examples over wifi: edison.local:4488, \<RENAMED EDISON\>:4488, X.X.X.X:4488.
  
  Important this does not use a ssl connection so passwords are sent in plain text.
