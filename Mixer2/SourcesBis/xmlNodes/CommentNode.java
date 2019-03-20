package xmlNodes;
//XMLMixer: a tool for embedding annotations into XML files.

//Copyright (C) 2017  Bertrand Gaiffe
//bertrand.gaiffe@atilf.fr

//This program is free software: you can redistribute it and/or modify
//it under the terms of the GNU General Public License as published by
//the Free Software Foundation, either version 3 of the License, or
//(at your option) any later version.

//This program is distributed in the hope that it will be useful,
//but WITHOUT ANY WARRANTY; without even the implied warranty of
//MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//GNU General Public License for more details.

//You should have received a copy of the GNU General Public License
//along with this program.  If not, see <http://www.gnu.org/licenses/>.

import xmlNodes.GenericNode;

public class CommentNode implements GenericNode {
	String content;

	public CommentNode(String c) {
		this.content = c;
	}

	@Override
	public int getType() {
		return GenericNode.COMMENT_NODE;
	}

	@Override
	public String toString() {
		return "<!--" + this.content + "-->"; //$NON-NLS-1$ //$NON-NLS-2$
	}

	@Override
	public String getStringValue() {
		return this.content;
	}

	@Override
	public boolean equals(GenericNode other) {
		return other.getType() == GenericNode.COMMENT_NODE
				&& this.content.compareTo(((CommentNode) other).content) == 0;
	}
}

