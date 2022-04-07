import os

try:
	cmdline = open('/proc/cmdline', 'r').readline()
	kernel_device = cmdline.rsplit('kernel=', 1)[1].split(' ', 1)[0]
	link_device = kernel_device.replace("mtd","mtdblock",1)
	if os.path.exists(link_device):
		#print kernel_device
		os.symlink(link_device, '/dev/kernel')
except:
	pass
