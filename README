meta-opie
=========

This layer provides the metadata necessary to build Opie, Qt/Embedded 2.3.10,
related libraries and 3rd-party Qtopia applications. Initially based on
recipes developed within OpenEmbedded master.

For more information on Opie, see the Opie website:

  http://opie.sourceforge.net/


Dependencies
------------

This layer depends on:

URI: git://git.openembedded.org/openembedded-core
branch: master
revision: HEAD

URI: git://git.openembedded.org/meta-openembedded
subdirectory: meta-oe
branch: master
revision: HEAD

URI: git://git.openembedded.org/meta-openembedded
subdirectory: meta-networking
branch: master
revision: HEAD


Usage
-----

To build Opie you need to 'require' an appropriate .inc file from
conf/distro/include within your distro conf file or local.conf, e.g.:

require conf/distro/include/preferred-opie-versions-1.2.5.inc

Then you should be able to build an Opie image:

$ bitbake opie-image


Maintenance
-----------

Send patches / pull requests to openembedded-devel@lists.openembedded.org
with '[meta-opie]' in the subject.

Main layer maintainer: Paul Eggleton <paul.eggleton@linux.intel.com>


License
-------

All metadata is MIT licensed unless otherwise stated. Source code included 
in tree for individual recipes is under the LICENSE stated in each recipe
(.bb file) unless otherwise stated.

This README document is Copyright (C) 2011 Intel Corporation.

