package tachyon.hadoop;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.EnumSet;

import org.apache.hadoop.fs.AbstractFileSystem;
import org.apache.hadoop.fs.BlockLocation;
import org.apache.hadoop.fs.CreateFlag;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileAlreadyExistsException;
import org.apache.hadoop.fs.FileChecksum;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FsServerDefaults;
import org.apache.hadoop.fs.FsStatus;
import org.apache.hadoop.fs.Options.ChecksumOpt;
import org.apache.hadoop.fs.ParentNotDirectoryException;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.UnresolvedLinkException;
import org.apache.hadoop.fs.UnsupportedFileSystemException;
import org.apache.hadoop.fs.permission.FsPermission;
import org.apache.hadoop.security.AccessControlException;
import org.apache.hadoop.util.Progressable;

public class AbstractFileSystemTFS extends AbstractFileSystem {

	public AbstractFileSystemTFS(URI uri, String supportedScheme,
			boolean authorityNeeded, int defaultPort) throws URISyntaxException {
		super(uri, supportedScheme, authorityNeeded, defaultPort);
		// TODO Auto-generated constructor stub
	}

	@Override
	public FSDataOutputStream createInternal(Path arg0,
			EnumSet<CreateFlag> arg1, FsPermission arg2, int arg3, short arg4,
			long arg5, Progressable arg6, ChecksumOpt arg7, boolean arg8)
			throws AccessControlException, FileAlreadyExistsException,
			FileNotFoundException, ParentNotDirectoryException,
			UnsupportedFileSystemException, UnresolvedLinkException,
			IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Path arg0, boolean arg1)
			throws AccessControlException, FileNotFoundException,
			UnresolvedLinkException, IOException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public BlockLocation[] getFileBlockLocations(Path arg0, long arg1, long arg2)
			throws AccessControlException, FileNotFoundException,
			UnresolvedLinkException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FileChecksum getFileChecksum(Path arg0)
			throws AccessControlException, FileNotFoundException,
			UnresolvedLinkException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FileStatus getFileStatus(Path arg0) throws AccessControlException,
			FileNotFoundException, UnresolvedLinkException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FsStatus getFsStatus() throws AccessControlException,
			FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FsServerDefaults getServerDefaults() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getUriDefaultPort() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public FileStatus[] listStatus(Path arg0) throws AccessControlException,
			FileNotFoundException, UnresolvedLinkException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void mkdir(Path arg0, FsPermission arg1, boolean arg2)
			throws AccessControlException, FileAlreadyExistsException,
			FileNotFoundException, UnresolvedLinkException, IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public FSDataInputStream open(Path arg0, int arg1)
			throws AccessControlException, FileNotFoundException,
			UnresolvedLinkException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void renameInternal(Path arg0, Path arg1)
			throws AccessControlException, FileAlreadyExistsException,
			FileNotFoundException, ParentNotDirectoryException,
			UnresolvedLinkException, IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setOwner(Path arg0, String arg1, String arg2)
			throws AccessControlException, FileNotFoundException,
			UnresolvedLinkException, IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setPermission(Path arg0, FsPermission arg1)
			throws AccessControlException, FileNotFoundException,
			UnresolvedLinkException, IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean setReplication(Path arg0, short arg1)
			throws AccessControlException, FileNotFoundException,
			UnresolvedLinkException, IOException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setTimes(Path arg0, long arg1, long arg2)
			throws AccessControlException, FileNotFoundException,
			UnresolvedLinkException, IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setVerifyChecksum(boolean arg0) throws AccessControlException,
			IOException {
		// TODO Auto-generated method stub

	}

}
